package org.marioioannou.kobwebproject1.pages

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.localStorage
import org.marioioannou.kobwebproject1.components.profileCard
import org.marioioannou.kobwebproject1.utils.Res

@Page
@Composable
fun HomePage() {
    var colorMode by ColorMode.currentState

            LaunchedEffect(colorMode) {
                val savedTheme = localStorage.getItem(Res.String.SAVED_THEME) ?: ColorMode.LIGHT.name
                colorMode = ColorMode.valueOf(savedTheme)
            }

    Box(
        Modifier.fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = Res.Theme.GRADIENT_ONE.color,
                    to = Res.Theme.GRADIENT_TWO.color
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        profileCard(colorMode = colorMode)
    }

}
