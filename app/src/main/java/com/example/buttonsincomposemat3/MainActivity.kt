package com.example.buttonsincomposemat3

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.buttonsincomposemat3.ui.theme.ButtonsInComposeMat3Theme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonsInComposeMat3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    /**
                     * Will be demonstrating the various types of buttons that exist in Material 3
                     * with Jetpack Compose.
                     *
                     * With Material 3, the padding, font size, etc. of the buttons are already
                     * built in.
                     */
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        /*
                        Filled buttons are typically used when a necessary action has a big
                        impact on the user experience.
                        */
                        Button(
                            onClick = { /*TODO*/ }
                        )
                        {
                            Text(text = "Filled Button")
                        }

                        /*
                        Elevated buttons usually have a shadow behind the button, and are used if
                        we need to make the button more visible.
                         */
                        ElevatedButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Icon( // adds Icon in button
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "Add",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Elevated Button")
                        }

                        /*
                        Filled Tonal Buttons are usually for actions that don't have a major impact
                        on the user experience, or for multiple buttons. Don't stand out as much.
                         */
                        FilledTonalButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Filled Tonal Button")
                        }

                        /*
                        Used when you don't want much emphasis on things. Outline Buttons are meant
                        to not draw focus.
                         */
                        OutlinedButton(
                            onClick = { /*TODO*/ }
                        ) {
                          Text(text = "Back")
                        }

                        /*
                        Used when you want to add some text to a button. Something that is unlikely that a
                        user would click.
                         */
                        TextButton(
                            onClick = { /*TODO*/ }
                        ) {
                          Text(text = "Text Button")
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    ButtonsInComposeMat3Theme {
        // TODO: add in button theme to test
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            /**
             * Will be demonstrating the various types of buttons that exist in Material 3
             * with Jetpack Compose.
             *
             * With Material 3, the padding, font size, etc. of the buttons are already
             * built in.
             */
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                /*
                Filled buttons are typically used when a necessary action has a big
                impact on the user experience.
                */
                Button(
                    onClick = { /*TODO*/ }
                )
                {
                    Text(text = "Filled Button")
                }

                /*
                Elevated buttons usually have a shadow behind the button, and are used if
                we need to make the button more visible.
                 */
                ElevatedButton(
                    onClick = { /*TODO*/ }
                ) {
                    Icon( // adds Icon in button
                        imageVector = Icons.Outlined.Add,
                        contentDescription = "Add",
                        modifier = Modifier.size(18.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Elevated Button")
                }

                /*
                Filled Tonal Buttons are usually for actions that don't have a major impact
                on the user experience, or for multiple buttons. Don't stand out as much.
                 */
                FilledTonalButton(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Filled Tonal Button")
                }

                /*
                Used when you don't want much emphasis on things. Outline Buttons are meant
                to not draw focus.
                 */
                OutlinedButton(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Back")
                }

                /*
                Used when you want to add some text to a button. Something that is unlikely that a
                user would click.
                 */
                TextButton(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Text Button")
                }
            }
        }
    }
}