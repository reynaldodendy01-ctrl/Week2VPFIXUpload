package com.example.week2vpfix.soal1


import android.R.attr.color
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2vpfix.R
@Composable
fun soal1View(){
    Box(Modifier.fillMaxSize().background(Color(0xFFF5F5F5))){
    Column(modifier = Modifier.fillMaxWidth().padding(5.dp).padding(top = 40.dp)) {
        Row() {
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("V", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
            Column(modifier = Modifier.weight(5f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Liked Song", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
            Column(modifier = Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("...", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
        }
        Row(modifier = Modifier.fillMaxWidth().padding(20.dp)) {
            Image(painter = painterResource(R.drawable.album),contentDescription = "deskripsi", modifier = Modifier.fillMaxWidth(), contentScale = ContentScale.FillWidth)
        }
        Row(modifier = Modifier.padding(horizontal =20.dp), verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.weight(1f)) {
                Row() {
                    Text("Stars",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp
                    )
                }
                Row() {
                    Text("Arash Buana",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp)
                }
            }
            Column(modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.End) {
                Text("♥", fontSize = 20.sp)
            }
        }
        Row(modifier = Modifier.padding(horizontal =20.dp)) {
            Text("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬")

        }
        Row(modifier = Modifier.padding(horizontal =20.dp)) {
            Column(modifier = Modifier.padding(vertical = 5.dp).weight(1f),
                horizontalAlignment = Alignment.Start) {
                Text("0:12")
            }
            Column(modifier = Modifier.padding(vertical = 5.dp).weight(1f),
                horizontalAlignment = Alignment.End) {
                Text("-2:12")
            }

        }
        Row(modifier = Modifier.padding(horizontal = 50.dp)) {
            Column(modifier= Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("⏮", fontSize = 50.sp)
            }
            Column(modifier= Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("▶", fontSize = 50.sp)
            }
            Column(modifier= Modifier.weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                Text("⏭", fontSize = 50.sp)
            }
        }

        Row(modifier = Modifier.padding(horizontal =20.dp).padding(top = 20.dp)) {
            Box(
                Modifier.fillMaxWidth().clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)).background(color= Color.Gray).heightIn(max = 300.dp)
            ) {
                Column(Modifier.padding(7.dp)) {
                    Text("Lyrics", Modifier.padding(top = 20.dp,start = 20.dp, end = 20.dp).padding(bottom = 10.dp), color=Color.White, fontWeight = FontWeight.Bold, fontSize= 20.sp)
                    Column (Modifier.verticalScroll(rememberScrollState()).padding(bottom = 20.dp,start = 20.dp, end = 20.dp, top = 2.dp)){
                        Text("""I was looking for the stars
Gazing from afar
Some would say that I will never know
If I didn't really go and find it on my own

Funny we've come very far
If I could just restart
From the time when you came whining onto me
Said u had a bad dream just so I'll sing you to sleep

Who would've guessed I'd fall in love
Something so pure and even more

I'll leave soon
Far from you
Please hold me til I disappear

What if we were meant apart
Will I still have your heart
But it's okay I guess if I just get replaced
I know I can't complain cause I'm the one to blame

I just can't bare on seeing you cry
And I know you'll keep on asking why

That I'll leave soon
Far from you
Please hold me til I disappear
But before I do
Just know that I love you
I'm sailing to somewhere new

I hear your voice keep calling out
I'm slowly losing my breath now
You keep on shouting my name out
It's time to leave I'll see you south
                        """, color = Color.White, fontSize = 20.sp)
                    }

                }
            }
        }

    }
}}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun soal1Preview(){
    soal1View()
}