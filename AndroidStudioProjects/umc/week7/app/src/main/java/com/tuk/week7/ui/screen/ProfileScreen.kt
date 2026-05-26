package com.tuk.week7.ui.screen


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tuk.week7.ui.theme.Black
import com.tuk.week7.ui.theme.MyApplicationTheme
import com.tuk.week7.ui.theme.White
import com.tuk.week7.ui.theme.TextSecondary
import com.tuk.week7.R

@Composable
fun ProfileScreen(
    onEditClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(White),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = onEditClick,
            colors = ButtonDefaults.buttonColors(
                containerColor = Black,
                contentColor = White
            ),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "프로필 수정")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfileScreenPreview() {
    MyApplicationTheme { ProfileScreen(onEditClick = {}) }
}