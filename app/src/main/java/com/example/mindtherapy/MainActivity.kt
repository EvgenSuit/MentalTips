package com.example.mindtherapy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.mindtherapy.data.TherapyItem
import com.example.mindtherapy.data.data
import com.example.mindtherapy.fonts.styles
import com.example.mindtherapy.ui.theme.MindTherapyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            MindTherapyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    var darkTheme by remember {
                        mutableStateOf(false)
                    }
                    MindTherapyTheme ( dynamicColor = false, darkTheme = darkTheme) {
                        TherapyApp(darkTheme = darkTheme, onClicked = {darkTheme = !darkTheme})
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(darkTheme: Boolean, onClicked:() -> Unit) {
           CenterAlignedTopAppBar(
               title = {
                   Text(
                       stringResource(id = R.string.app_name),
                       style = styles.titleLarge)
                       },
               navigationIcon = {
                       IconButton(onClick = onClicked) {
                           Icon(
                               painter =
                               if (darkTheme) {
                               painterResource(id = R.drawable.light_mode_24px)
                                            }
                               else {
                                    painterResource(id = R.drawable.dark_mode_24px)
                                    }, 
                               contentDescription = null)
                       }
           
               })
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TherapyApp(darkTheme: Boolean, onClicked:() -> Unit) {
    Scaffold (
        topBar = {AppBar(darkTheme = darkTheme, onClicked = onClicked)}
    ) {
        Column {
            LazyColumn(
                contentPadding = it,) {
                items(data) {item ->
                    TherapyItem(item)
                }
            }
        }
    }
}

@Composable
fun TherapyItem(item: TherapyItem, modifier: Modifier = Modifier) {
            Card (
                modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
            ) {
                Text(
                    stringResource(item.title),
                    style = styles.displayMedium,
                    modifier = Modifier
                        .padding(dimensionResource(id = R.dimen.padding_small))
                        .align(Alignment.CenterHorizontally))
                AnimatedImgDesc(item)
                }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimatedImgDesc(item: TherapyItem) {
    var showDescription by remember {
        mutableStateOf(false)
    }
    AnimatedContent(
        targetState = showDescription,
        modifier = Modifier.clickable { showDescription = !showDescription },
        transitionSpec = {
            if (targetState) {
                slideInVertically { height -> height } + fadeIn() with
                        slideOutVertically { height -> -height } + fadeOut()
            } else {
                slideInVertically { height -> -height } + fadeIn() with
                        slideOutVertically { height -> height } + fadeOut()
            }.using(
                SizeTransform(clip = false)
            )
        }, label = ""
    ) {
            showDescription ->
        ItemDetails(item = item, showDescription = showDescription)

    }
}
@Composable
fun ItemDetails(item: TherapyItem, showDescription: Boolean) {
    if (showDescription) {
        Text(
            text = stringResource(id = item.desc),
            style = styles.displaySmall,
            modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
        )
    } else {
        Image(
            painter = painterResource(id = item.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(dimensionResource(id = R.dimen.img_height))
                .fillMaxWidth()
        )
    }
}