package com.sparklead.swipefy.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sparklead.swipefy.R
import com.sparklead.swipefy.components.ClickableTextView
import com.sparklead.swipefy.components.DividerTextView
import com.sparklead.swipefy.components.GradiantButton
import com.sparklead.swipefy.components.HeadingTextView
import com.sparklead.swipefy.components.NormalEditTextView
import com.sparklead.swipefy.components.NormalTextView
import com.sparklead.swipefy.components.PasswordTextView

@Composable
fun SignUpScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp)
    ) {
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            NormalTextView(value = stringResource(id = R.string.hey_there))
            Spacer(modifier = Modifier.height(6.dp))
            HeadingTextView(value = stringResource(id = R.string.create_an_account))
            Spacer(modifier = Modifier.height(30.dp))
            NormalEditTextView(labelValue = "Name", painterResource(id = R.drawable.ic_person))
            Spacer(modifier = Modifier.height(15.dp))
            NormalEditTextView(labelValue = "Email", painterResource(id = R.drawable.ic_email))
            Spacer(modifier = Modifier.height(15.dp))
            PasswordTextView(
                labelValue = "Password",
                painterResources = painterResource(id = R.drawable.ic_password)
            )
            Spacer(modifier = Modifier.height(15.dp))
            PasswordTextView(
                labelValue = "Confirm password",
                painterResources = painterResource(id = R.drawable.ic_password)
            )
            Spacer(modifier = Modifier.height(80.dp))
            GradiantButton(value = "Register")
            Spacer(modifier = Modifier.height(40.dp))
            DividerTextView(value = "or")
            Spacer(modifier = Modifier.height(40.dp))
            ClickableTextView()
        }
    }
}

@Preview
@Composable
fun Preview() {
    SignUpScreen()
}