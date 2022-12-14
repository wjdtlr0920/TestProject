package com.js.composecamp2022_practice_pathway_basics_codelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.js.composecamp2022_practice_pathway_basics_codelab.ui.theme.TestProjectTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      TestProjectTheme {
        MyApp()
      }
    }
  }
}

@Composable
private fun BlockScreen(onContinueClicked: () -> Unit) {

  Column(
    modifier = Modifier
      .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = CenterHorizontally
  ) {
    Text(
      text = stringResource(id = R.string.block_info),
    )
    Button(
      modifier = Modifier
        .padding(24.dp),
      onClick = onContinueClicked
    ) {
      Text(text = stringResource(id = R.string.block_button))
    }
  }
}

@Preview(showBackground = true)
@Composable
fun MyListView(names: List<String> = List(1000) { "${it + 1}" }) {
  LazyColumn {
    items(items = names) { item ->

      val rememberIsOpen = remember { mutableStateOf(false) }

      Card(
        modifier = Modifier
          .padding(vertical = 4.dp, horizontal = 8.dp)
      ) {
        Row(
          modifier = Modifier
            .padding(12.dp)
            .animateContentSize(
              animationSpec = spring(
                dampingRatio = Spring.DampingRatioMediumBouncy,
                stiffness = Spring.StiffnessLow
              )
            )
        ) {
          Column(
            modifier = Modifier
              .weight(1f)
              .padding(12.dp)

          ) {
            Text(
              text = stringResource(id = R.string.my_list_view_title),
              style = MaterialTheme.typography.bodyLarge
            )
            Text(
              text = item,
              style = MaterialTheme.typography.displayMedium
            )
            if (rememberIsOpen.value) {
              Text(
                text = "Compose Camp2022".repeat(4)
              )
            }
          }

          IconButton(onClick = { rememberIsOpen.value = !rememberIsOpen.value }) {
            Icon(
              imageVector = if (rememberIsOpen.value) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore ,
              contentDescription = stringResource(R.string.show_less)
            )
          }
        }
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun MyApp() {
  val isClicked = rememberSaveable { mutableStateOf(false) }

  if (isClicked.value) {
    MyListView()
  } else {
    BlockScreen(onContinueClicked = { isClicked.value = true })
  }
}