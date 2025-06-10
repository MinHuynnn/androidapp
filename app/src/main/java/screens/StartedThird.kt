package screens

import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.th2_week4.R
import navigation.Routes
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewStartedThird() {
    StartedThird(navController = rememberNavController())
}

@Composable
fun StartedThird(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(onClick = {
                navController.navigate(Routes.Splash)
            }, colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFF42A5F5)
            )
            ) {
                Text("Skip")
            }
        }

        Image(
            painter = painterResource(id = R.drawable.screen3),
            contentDescription = "Step 3",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Reminder Notification", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(10.dp))
            Text("The advantage of this application is that it also provides reminders for you so you don't forget to keep doing your assignments well and according to the time you have set")
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = { navController.navigate(Routes.Second) },
                modifier = Modifier
                    .size(55.dp)
                    .background(
                        color = Color(0xFF42A5F5),
                        shape = CircleShape
                    )
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back",
                    tint = Color(0xFFEBEEF1)
                )
            }

            Button(
                onClick = {
                    navController.navigate(Routes.Splash) {
                        popUpTo(Routes.Splash) { inclusive = true }
                    }
                },
                modifier = Modifier.width(200.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF42A5F5),
                    contentColor = Color(0xFFEBEEF1)
                )
            ) {
                Text("Get Started")
            }
        }
    }
}
