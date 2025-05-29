package screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ui_week3.R

@Composable
fun WelcomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp, vertical = 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp, end = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Column(horizontalAlignment = Alignment.End) {
                Text("", fontWeight = FontWeight.Bold, fontSize = 24.sp)
                Text("", fontSize = 16.sp)
            }
        }
        Spacer(modifier = Modifier.height(56.dp))
        Box(
            modifier = Modifier
                .size(220.dp)

                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.home_image),
                contentDescription = "home",
                modifier = Modifier.fillMaxSize()
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Text("Jetpack Compose", fontWeight = FontWeight.Bold, fontSize = 24.sp, modifier = Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
            textAlign = TextAlign.Center,
            color = Color.Gray,
            fontSize = 16.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { navController.navigate("components") },
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .padding(bottom = 50.dp),
            shape = RoundedCornerShape(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2))
        ) {
            Text("I'm ready", fontWeight = FontWeight.Bold, fontSize = 20.sp)
        }
    }
}