package com.example.week2vpfix.soal2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.week2vpfix.R
import com.example.week2vpfix.soal1.soal1View
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Font

@Composable
fun soal2View(){
    var enjoyed by remember {mutableStateOf("")}
    var spot by remember {mutableStateOf("")}
    var add by remember {mutableStateOf("")}
    val Poppins = FontFamily(
        Font(R.font.poppins_regular, FontWeight.Normal),
        Font(R.font.poppins_medium, FontWeight.Medium),
        Font(R.font.poppins_semibold, FontWeight.SemiBold),
        Font(R.font.poppins_bold, FontWeight.Bold)
    )

    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.walpaper), "desk",  contentScale = ContentScale.FillHeight,modifier = Modifier.fillMaxSize())
        Column(modifier=Modifier.fillMaxSize(),verticalArrangement = Arrangement.Bottom){
                Box(modifier=Modifier.clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)).fillMaxWidth().background(Color(0xFF1E7DB2)).heightIn(500.dp)){
                    Column() {
                        Row() {
                            Text("My Travel", fontFamily = Poppins, fontSize = 30.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, modifier=Modifier.fillMaxWidth().padding(top=30.dp),color=Color.White)
                        }
                        Row(modifier = Modifier.padding(start = 20.dp)) {
                            Text("Aurora", fontFamily = Poppins, fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier=Modifier.padding(top=25.dp),color=Color.White)
                        }
                        Row(modifier = Modifier.padding(start = 20.dp)) {
                            Text("Tromsø, Norway", fontFamily = Poppins, fontSize = 20.sp, modifier=Modifier.padding(top=10.dp),color=Color.White)
                        }
                        Row(modifier = Modifier.padding(start = 20.dp).padding(top=5.dp)) {
                            Text("★★★★★ 5.0", fontFamily = Poppins,fontSize = 20.sp,color=Color.Yellow)
                        }
                        Row(Modifier.padding(vertical = 5.dp)) {
                            TextField(
                                value = enjoyed,
                                onValueChange = {enjoyed=it},
                                placeholder = {Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                                    Text("What did you enjoy most about your trip?", fontFamily = Poppins, color = Color.Black, textAlign = TextAlign.Center)}},
                                modifier=Modifier.padding(horizontal = 20.dp).fillMaxWidth().clip(RoundedCornerShape(15 )).height(60.dp),
                            )
                        }
                        Row(Modifier.padding(vertical = 5.dp)) {
                            TextField(
                                value = spot,
                                onValueChange = {spot=it},
                                placeholder = {Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                                    Text("What was your favorite spot?", fontFamily = Poppins, color = Color.Black, textAlign = TextAlign.Center)}},
                                modifier=Modifier.padding(horizontal = 20.dp).fillMaxWidth().clip(RoundedCornerShape(15 )).height(60.dp),
                            )
                        }
                        Row(Modifier.padding(vertical = 5.dp)) {
                            TextField(
                                value = add,
                                onValueChange = {add=it},
                                placeholder = {Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                                    Text("Anything else you'd like to add?", fontFamily = Poppins, color = Color.Black, textAlign = TextAlign.Center)}},
                                modifier=Modifier.padding(horizontal = 20.dp).fillMaxWidth().clip(RoundedCornerShape(15 )).height(60.dp),
                            )
                        }
                        Row(horizontalArrangement = Arrangement.End, modifier=Modifier.fillMaxWidth().padding(horizontal = 10.dp).padding(top=15.dp)) {
                            FloatingActionButton(
                                onClick = {},
                                shape = RoundedCornerShape(15.dp),
                                containerColor = Color.White,
                                contentColor = Color.Black,
                                modifier = Modifier.size(58.dp),
                            ) {
                                Text(
                                    text = "+",
                                    fontSize = 34.sp,
                                    textAlign = TextAlign.Center,
                                    //color=Color.Black
                                )
                            }

                        }
                    }
                }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun soal2Preview(){
    soal2View()
}