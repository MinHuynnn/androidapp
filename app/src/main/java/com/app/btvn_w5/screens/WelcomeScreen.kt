package com.app.btvn_w5.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun WelcomeScreen(onGoogleSignIn: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = com.app.btvn_w5.R.drawable.background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.35f)
                .align(Alignment.TopCenter)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .padding(top = 60.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(160.dp)
                    .background(Color(0xFFE3F0FB), RoundedCornerShape(24.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = com.app.btvn_w5.R.drawable.logo_uth),
                    contentDescription = "UTH Logo",
                    modifier = Modifier.size(120.dp)
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "SmartTasks",
                color = Color(0xFF4285F4),
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp
            )
            Text(
                text = "A simple and efficient to-do app",
                color = Color(0xFF4285F4),
                fontSize = 16.sp
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Welcome",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = "Ready to explore? Log in to get started.",
                fontSize = 16.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = onGoogleSignIn,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE3F0FB)),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .height(48.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = com.app.btvn_w5.R.drawable.logo_google),
                        contentDescription = "Google Logo",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "SIGN IN WITH GOOGLE",
                        color = Color(0xFF1A237E),
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Text(
            text = "© UTHSmartTasks",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 24.dp)
        )
    }
} 