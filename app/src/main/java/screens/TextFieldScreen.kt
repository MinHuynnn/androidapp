package screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@Composable
fun TextFieldScreen(navController: NavHostController) {
    var text by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }
            Spacer(Modifier.width(8.dp))
            Text("TextField", color = Color(0xFF5B9EFF), fontWeight = androidx.compose.ui.text.font.FontWeight.Bold, fontSize = 22.sp)
        }
        Spacer(Modifier.height(32.dp))
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("Thông tin nhập") },
            modifier = Modifier.fillMaxWidth(0.8f)
        )
        Spacer(Modifier.height(8.dp))
        Text("Tự động cập nhật dữ liệu theo textfield", color = Color.Red)
    }
}