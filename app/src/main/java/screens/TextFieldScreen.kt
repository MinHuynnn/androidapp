package screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TextFieldScreen(navController: NavHostController) {
    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Tiêu đề + nút Back
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        ) {
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Icon(Icons.Default.ArrowBack, contentDescription = "Back")
            }

            Text(
                text = "TextField",
                color = Color(0xFF2196F3), // màu xanh dương
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        // Spacer để đẩy phần nội dung chính vào giữa
        Spacer(modifier = Modifier.weight(1f))

        // Nội dung chính căn giữa dọc
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            placeholder = { Text("Thông tin nhập") },
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth(0.9f)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Tự động cập nhật dữ liệu theo textfield",
            color = Color.Red,
            fontSize = 14.sp
        )

        // Spacer để đẩy phần nội dung chính vào giữa
        Spacer(modifier = Modifier.weight(1f))
    }
}
