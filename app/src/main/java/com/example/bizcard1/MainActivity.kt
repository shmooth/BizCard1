package com.example.bizcard1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bizcard1.ui.theme.BizCard1Theme


class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      BizCard1Theme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background) {
          BizCard()
        }
      }
    }
  }
}


/**
 * Main function.
 */
@Composable
fun BizCard() {
  Profile()
  ContactInfo()
}


@Composable
fun Profile() {
  Box(
    modifier = Modifier
      .padding(16.dp)
      .fillMaxSize(),
    contentAlignment = BiasAlignment(0f, -0.3f),
  ) {
    Column(
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      // icon
      Image(
        painter = painterResource(id = R.drawable.android_robot_head),
        contentDescription = null, // decorative element
      )
      // Full Name
      Text(
        "Some Person",
        fontSize = 36.sp,
        fontWeight = FontWeight.Bold
      )
      // Title
      Text(
        "Some Title",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold
      )
    }
  }
}


@Composable
fun ContactInfo() {
  Box(
    modifier = Modifier
      .padding(16.dp, 16.dp, 16.dp, 64.dp)
      .fillMaxSize(),
    contentAlignment = Alignment.BottomCenter
  ) {
    Column(
    )
    {
      ContactInfoRow(icon = Icons.Default.Phone, text = "###-###-####")
      ContactInfoRow(icon = Icons.Default.Home, text = "@sometwithandle")
      ContactInfoRow(icon = Icons.Default.Email, text = "someone@gmail.com")
    }
  }
}

@Composable
fun ContactInfoRow(icon: ImageVector, text: String) {
  Row(
    verticalAlignment = Alignment.Bottom,
    modifier = Modifier.fillMaxWidth(.9f)
  )
  {
    Icon(
      icon, contentDescription = "icon",
      modifier = Modifier.size(28.dp)
    )
    Spacer(modifier = Modifier.weight(1f))
    Text(
      text,
      fontSize = 28.sp,
    )
  }
}



@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
  Profile()
}

@Preview(showBackground = true)
@Composable
fun ContactInfoPreview() {
  ContactInfo()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
  BizCard1Theme {
    BizCard()
  }
}
