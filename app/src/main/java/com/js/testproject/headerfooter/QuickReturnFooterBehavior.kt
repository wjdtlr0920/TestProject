package com.js.testproject.headerfooter

import android.animation.Animator
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.interpolator.view.animation.FastOutSlowInInterpolator

class QuickReturnFooterBehavior : CoordinatorLayout.Behavior<View>() {

  private val ANIMATION_DURATION = 200L
  private val INTERPOLATOR = FastOutSlowInInterpolator()
  private var dyDirectionSum = 0
  private var isHiding = false
  private var isShowing = false

  override fun onStartNestedScroll(
    coordinatorLayout: CoordinatorLayout,
    child: View,
    directTargetChild: View,
    target: View,
    axes: Int,
    type: Int
  ): Boolean {
    return super.onStartNestedScroll(
      coordinatorLayout,
      child,
      directTargetChild,
      target,
      axes,
      type
    )
    return axes == ViewCompat.SCROLL_AXIS_VERTICAL
  }

  override fun onNestedPreScroll(
    coordinatorLayout: CoordinatorLayout,
    child: View,
    target: View,
    dx: Int,
    dy: Int,
    consumed: IntArray,
    type: Int
  ) {

    // 스크롤이 반대방향으로 전환
    if (dy > 0 && dyDirectionSum < 0
      || dy < 0 && dyDirectionSum > 0
    ) {
      child.animate().cancel();
      dyDirectionSum = 0;
    }

    dyDirectionSum += dy;

    if (dyDirectionSum > child.height) {
      hideView(child)
    } else if (dyDirectionSum < -child.height) {
      showView(child)
    }
  }


  private fun hideView(view: View) {
    if (isHiding || view.visibility != View.VISIBLE) {
      return;
    }

    val animator = view.animate()
      .translationY(view.height.toFloat())
      .setInterpolator(INTERPOLATOR)
      .setDuration(ANIMATION_DURATION)

    animator.setListener(object : Animator.AnimatorListener {

      override fun onAnimationStart(animation: Animator?) {
        isHiding = true
      }

      override fun onAnimationEnd(animation: Animator?) {
        isHiding = false
        view.visibility = View.INVISIBLE
      }

      override fun onAnimationCancel(animation: Animator?) {
        isHiding = false
        showView(view)
      }

      override fun onAnimationRepeat(animation: Animator?) {}
    })

    animator.start()
  }

  private fun showView(view: View) {
    if (isShowing || view.visibility == View.VISIBLE) {
      return
    }
    val animator = view.animate()
      .translationY(0.0f)
      .setInterpolator(INTERPOLATOR)
      .setDuration(ANIMATION_DURATION)

    animator.setListener(object : Animator.AnimatorListener {

      override fun onAnimationStart(animation: Animator?) {
        isShowing = true
        view.visibility = View.VISIBLE
      }

      override fun onAnimationEnd(animation: Animator?) {
        isShowing = false
      }

      override fun onAnimationCancel(animation: Animator?) {
        isShowing = false
        hideView(view)
      }

      override fun onAnimationRepeat(animation: Animator?) {}
    })

    animator.start()

  }
}