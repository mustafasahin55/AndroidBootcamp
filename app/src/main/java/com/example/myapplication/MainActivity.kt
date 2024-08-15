package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AnaRenk
import com.example.myapplication.ui.theme.AnaRenkDark
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.YaziRenk1
import com.example.myapplication.ui.theme.YaziRenk2
import com.example.myapplication.ui.theme.YaziRenk2Dark
import com.example.myapplication.ui.theme.greyqore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Anasayfa()
            }
        }
    }
}

//Left - Start(Android), Leading(IOS)
//Right- End(Android), Trailing(IOS)
// @ işareti xml dosyalarda res klasörünü temsil eder
// R harfi kotlin dosyalarında res klasörünü temsil eder
//MaterialDesign
//envato ui kits
//adobe color
//icon kitchen
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Anasayfa() {
    val configuration = LocalConfiguration.current
    val ekranGenisligi = configuration.screenWidthDp
    val ekranYuksekligi = configuration.screenHeightDp
    if (isSystemInDarkTheme()) AnaRenk = AnaRenkDark
    if (isSystemInDarkTheme()) YaziRenk2 = YaziRenk2Dark
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Pizza",
                        fontFamily = greyqore,
                        fontWeight = FontWeight.Bold,
                        fontSize = 46.sp
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = AnaRenk,
                    titleContentColor = YaziRenk1
                )
            )

        }

    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally


        ) {
            Text(
                text = stringResource(id = R.string.pizzaBaslik),
                color = AnaRenk,
                fontWeight = FontWeight.Bold,
                fontSize = (ekranGenisligi*0.05).sp
            )
            Image(painter = painterResource(id = R.drawable.pizza_resim), contentDescription = "")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Chip(stringResource(id = R.string.peynirYazi))
                Chip(stringResource(id = R.string.sucukYazi))
                Chip(stringResource(id = R.string.zeytinYazi))
                Chip(stringResource(id = R.string.biberYazi))


            }

            Text(
                text = stringResource(id = R.string.teslimatSüre),
                color = YaziRenk2,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = stringResource(id = R.string.teslimatBaslik),
                color = AnaRenk,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = stringResource(id = R.string.pizzaAciklama),
                color = YaziRenk2,
                fontSize = 22.sp,
                textAlign = TextAlign.Center
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (ekranGenisligi * 0.05).dp, end = (ekranGenisligi * 0.05).dp),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Text(
                    text = stringResource(id = R.string.fiyat),
                    color = AnaRenk,
                    fontWeight = FontWeight.Bold,
                    fontSize = 44.sp
                )
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AnaRenk,
                        contentColor = YaziRenk1
                    )
                ) {
                    Text(text = stringResource(id = R.string.butonYazi), fontSize = 18.sp)

                }
            }


        }
    }

}


@Preview(showBackground = true, locale = "tr")
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Anasayfa()
    }
}