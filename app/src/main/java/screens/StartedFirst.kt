package screens

import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.th2_week4.R
import navigation.Routes
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewStartedFirst() {
    StartedFirst(navController = rememberNavController())
}

@Composable
fun StartedFirst(navController: NavController) {
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
            painter = painterResource(id = R.drawable.screen1),
            contentDescription = "Step 1",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Easy Time Management", style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(10.dp))
            Text("With management based on priority and daily tasks, it will give you convenience in managing and determining the tasks that must be done first ")
        }

        Button(
            onClick = { navController.navigate(Routes.Second) },
            modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF42A5F5),
                contentColor = Color(0xFFEBEEF1)
        )
        ) {
            Text("Next")
        }

    }
    }

