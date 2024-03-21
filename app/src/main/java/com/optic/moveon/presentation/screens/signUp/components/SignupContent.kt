package com.optic.moveon.presentation.screens.signUp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.optic.moveon.R
import com.optic.moveon.presentation.components.DefaultButton
import com.optic.moveon.presentation.components.DefaultTextField
import com.optic.moveon.presentation.navigation.AppScreen
import com.optic.moveon.presentation.screens.signUp.SignupViewModel
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun SignupContent(viewModel: SignupViewModel = hiltViewModel()){
    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(80.dp))
        Image(
            modifier = Modifier.height(130.dp),
            painter = painterResource(id = R.drawable.user),
            contentDescription = "Logo de la aplicación"
        )
        Spacer(modifier = Modifier.height(10.dp))
        Card(
            modifier = Modifier.padding(start = 40.dp, end = 40.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent
            )
        ) {

            Column(
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Text(
                    modifier = Modifier.padding(top = 20.dp),
                    text = "SIGN UP",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Please fill the details to continue"
                )
                DefaultTextField(modifier = Modifier.padding(top = 15.dp),
                    value = viewModel.username.value,
                    onValueChange = {viewModel.username.value = it},
                    label = "Username",
                    icon = Icons.Default.AccountCircle,
                    errorMsg = viewModel.usernameErrMsg.value,
                    validateField = {viewModel.validateUsername()}
                )
                DefaultTextField(modifier = Modifier.padding(top = 15.dp),
                    value = viewModel.email.value,
                    onValueChange = {viewModel.email.value = it},
                    label = "E-mail",
                    icon = Icons.Default.Email,
                    keyboardType = KeyboardType.Email,
                    errorMsg = viewModel.emailErrMsg.value,
                    validateField = {viewModel.validateEmail()}
                    )
                DefaultTextField(modifier = Modifier.padding(top = 15.dp),
                    value = viewModel.password.value,
                    onValueChange = {viewModel.password.value = it},
                    label = "Password",
                    icon = Icons.Default.Lock,
                    hideText = true,
                    errorMsg = viewModel.passwordErrMsg.value,
                    validateField = {viewModel.validatePassword()}
                    )
                DefaultTextField(modifier = Modifier.padding(top = 15.dp),
                    value = viewModel.confirmPassword.value,
                    onValueChange = {viewModel.confirmPassword.value = it},
                    label = "Confirm Password",
                    icon = Icons.Outlined.Lock,
                    hideText = true,
                    errorMsg = viewModel.confirmPasswordErrMsg.value,
                    validateField = {viewModel.validateConfirmPassword()}
                    )
                Spacer(modifier = Modifier.height(20.dp))
                DefaultButton(
                    text = "SIGN UP",
                    onClick = { },
                    enabled = viewModel.isEnabledLoginButton
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}


