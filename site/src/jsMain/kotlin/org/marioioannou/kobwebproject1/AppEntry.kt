package org.marioioannou.kobwebproject1

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import com.varabyte.kobweb.compose.css.ScrollBehavior
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.compose.ui.modifiers.scrollBehavior
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import com.varabyte.kobweb.silk.theme.colors.palette.button
import kotlinx.browser.localStorage
import org.jetbrains.compose.web.css.vh
import org.marioioannou.kobwebproject1.utils.Res

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}

@InitSilk
fun overrideSilkTheme(context: InitSilkContext) {
    context.apply {
        theme.palettes.apply {
            light.apply {
                button.apply {
                    default = Res.Theme.BLUEISH.color
                    hover = Res.Theme.BLUEISH.color
                    pressed = Res.Theme.BLUEISH.color
                }
            }

            dark.apply {
                button.apply {
                    default = Res.Theme.BLUEISH.color
                    hover = Res.Theme.BLUEISH.color
                    pressed = Res.Theme.BLUEISH.color
                }
            }
        }
    }
}