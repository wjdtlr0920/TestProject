package com.js.composecamp2022_practice_pathway_basic_layout_codelab

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.js.composecamp2022_practice_pathway_basic_layout_codelab.ui.theme.TestProjectTheme
import java.util.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      TestProjectTheme {
        // A surface container using the 'background' color from the theme
//        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        HomeScreen()
//        }
      }
    }
  }
}

private data class DrawableStringPair(
  @DrawableRes val drawable: Int,
  @StringRes val text: Int
)

private val alignYourBodyData = listOf(
  R.drawable.ab1_inversions to R.string.ab1_inversions,
  R.drawable.ab2_quick_yoga to R.string.ab2_quick_yoga,
  R.drawable.ab3_stretching to R.string.ab3_stretching,
  R.drawable.ab4_tabata to R.string.ab4_tabata,
  R.drawable.ab5_hiit to R.string.ab5_hiit,
  R.drawable.ab6_pre_natal_yoga to R.string.ab6_pre_natal_yoga
).map { DrawableStringPair(it.first, it.second) }

private val favoriteCollectionsData = listOf(
  R.drawable.fc1_short_mantras to R.string.fc1_short_mantras,
  R.drawable.fc2_nature_meditations to R.string.fc2_nature_meditations,
  R.drawable.fc3_stress_and_anxiety to R.string.fc3_stress_and_anxiety,
  R.drawable.fc4_self_massage to R.string.fc4_self_massage,
  R.drawable.fc5_overwhelmed to R.string.fc5_overwhelmed,
  R.drawable.fc6_nightly_wind_down to R.string.fc6_nightly_wind_down
).map { DrawableStringPair(it.first, it.second) }

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchView() {

  TextField(
    modifier = Modifier
      .fillMaxWidth()
      .padding(16.dp),
    value = "Search",
    onValueChange = {},
    leadingIcon = {
      Icon(
        imageVector = Icons.Default.Search,
        contentDescription = null
      )
    },
//    trailingIcon = {
//      Icon(
//        imageVector = Icons.Default.Search,
//        contentDescription = null
//      )
//    }
  )
}

@Preview
@Composable
fun FavoriteCollectionPreview() {
  FavoriteCollection(Modifier)
}

@Composable
fun FavoriteCollection(modifier: Modifier) {

  Text(
    modifier = Modifier
      .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
      .padding(horizontal = 16.dp),
    text = stringResource(id = R.string.favorite_collections).uppercase(Locale.getDefault())
  )

  LazyHorizontalGrid(
    rows = GridCells.Fixed(2),
    contentPadding = PaddingValues(horizontal = 16.dp),
    horizontalArrangement = Arrangement.spacedBy(8.dp),
    verticalArrangement = Arrangement.spacedBy(8.dp),
    modifier = modifier.height(120.dp)
  ) {
    items(favoriteCollectionsData) {
      FavoriteCollectionItem(drawableId = it.drawable, stringId = it.text, modifier = Modifier)
    }
  }
}

@Preview
@Composable
fun FavoriteCollectionItemPreview() {
  FavoriteCollectionItem(R.drawable.fc1_short_mantras, R.string.fc1_short_mantras, Modifier)
}

@Composable
fun FavoriteCollectionItem(
  @DrawableRes drawableId: Int,
  @StringRes stringId: Int,
  modifier: Modifier
) {
  Surface(
    shape = MaterialTheme.shapes.small,
    modifier = modifier.height(56.dp)
  ) {
    Row(
      verticalAlignment = Alignment.CenterVertically,
      modifier = Modifier
        .width(192.dp)
    ) {
      Image(
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(56.dp),
        painter = painterResource(id = drawableId),
        contentDescription = null
      )
      Text(
        modifier = Modifier.padding(horizontal = 16.dp),
        text = stringResource(id = stringId)
      )
    }
  }
}

@Preview
@Composable
fun CategoryPreview() {
  CategoryView(Modifier)
}

@Composable
fun CategoryView(modifier: Modifier) {
  Column(modifier = Modifier.background(colorResource(id = R.color.white))) {
    Text(
      modifier = Modifier
        .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
        .padding(horizontal = 16.dp),
      text = stringResource(id = R.string.align_your_body).uppercase(Locale.getDefault())
    )
    LazyRow(
      horizontalArrangement = Arrangement.spacedBy(8.dp),
      contentPadding = PaddingValues(horizontal = 16.dp),
      modifier = modifier
    ) {
      items(alignYourBodyData) { item ->
        CategoryItemView(item.drawable, item.text)
      }
    }
  }
}

@Preview
@Composable
fun CategoryItemPreview() {
  CategoryItemView(drawableId = R.drawable.ab1_inversions, stringId = R.string.ab1_inversions)
}

@Composable
fun CategoryItemView(@DrawableRes drawableId: Int, @StringRes stringId: Int) {
  Column(
    modifier = Modifier.background(colorResource(id = R.color.white)),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
  ) {
    Image(
      modifier = Modifier
        .clip(CircleShape)
        .size(88.dp),
      painter = painterResource(id = drawableId),
      contentScale = ContentScale.Crop,
      contentDescription = null
    )
    Text(text = stringResource(id = stringId))
  }
}

@Composable
private fun SootheBottomNavigation(modifier: Modifier = Modifier) {

  BottomNavigation(
    backgroundColor = MaterialTheme.colors.background,
    modifier = modifier
  ) {
    BottomNavigationItem(
      modifier = modifier,
      icon = {
        Icon(
          imageVector = Icons.Default.Spa,
          contentDescription = null
        )
      },
      label = {
        Text(text = stringResource(id = R.string.bottom_navigation_home))
      },
      selected = true,
      onClick = {}
    )
    BottomNavigationItem(
      modifier = modifier,
      icon = {
        Icon(
          imageVector = Icons.Default.AccountCircle,
          contentDescription = null
        )
      },
      label = {
        Text(text = stringResource(id = R.string.bottom_navigation_profile))
      },
      selected = false,
      onClick = {}
    )
  }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(widthDp = 360, heightDp = 640)
@Composable
fun HomeScreen() {

  val mutableState = mutableStateOf(0)

  Scaffold(
    bottomBar = { SootheBottomNavigation() }
  ) {
    Surface(modifier = Modifier
      .background(colorResource(id = R.color.white))
      .padding(it)) {
      Column {
        SearchView()
        CategoryView(modifier = Modifier)
        FavoriteCollection(modifier = Modifier)
      }
    }
  }
}