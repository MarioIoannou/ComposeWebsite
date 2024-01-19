package org.marioioannou.kobwebproject1.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Alignment.Vertical
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.marioioannou.kobwebproject1.styles.ButtonStyle
import org.marioioannou.kobwebproject1.styles.SocialIcon
import org.marioioannou.kobwebproject1.styles.SocialIconStyle
import org.marioioannou.kobwebproject1.styles.iconButton
import org.marioioannou.kobwebproject1.utils.Res

@Composable
fun informationSide(
    breakpoint: Breakpoint,
    colorMode: ColorMode
){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(all = 50.px),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = if (breakpoint <= Breakpoint.SM)
        Alignment.CenterHorizontally else Alignment.Start
    ) {
            SpanText(
                text = Res.String.NAME,
                modifier = Modifier
                    .margin(bottom = 12.px)
                    .fontFamily(Res.String.INTER_BOLD)
                    .color(Colors.Black)
                    .fontSize(50.px)
                    .textAlign(
                        if (breakpoint <= Breakpoint.SM) TextAlign.Center
                        else TextAlign.Start
                    )
            )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = Modifier
                .margin(bottom = 24.px)
                .fontFamily(Res.String.INTER_REGULAR)
                .color(Colors.Black)
                .fontSize(20.px)
        )
        Surface(
             modifier = Modifier
                 .height(4.px)
                 .width(40.px)
                 .margin(bottom = 24.px)
                 .background(Res.Theme.BLACK.color)
                 .align(
                     if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                     else Alignment.Start
                 )
        ){}
        SpanText(
            modifier = Modifier
                .margin(bottom = 30.px)
                .fontFamily(Res.String.INTER_REGULAR)
                .color(Colors.Black)
                .opacity(70.percent)
                .lineHeight(2)
                .fontSize(14.px)
                .textAlign(
                    if (breakpoint <= Breakpoint.SM) TextAlign.Center
                    else TextAlign.Start
                ),
            text = Res.String.ABOUT_ME,
        )
        Button(
            modifier = ButtonStyle.toModifier()
                .margin(bottom = 30.px).opacity(50.percent),
            size = ButtonSize.LG,
            onClick = {
                window.location.href = Res.String.TEXT_EMAIL
            }
        ){
            Image(
                modifier = Modifier
                    .margin(right = 12.px),
                height = 15,
                src = Res.Icon.ICON_EMAIL_WHITE
            )
            SpanText(
                modifier = Modifier
                    .fontSize(14.px)
                    .color(Colors.White)
                    .fontFamily(Res.String.INTER_BOLD),
                text = Res.String.BTN_GET_IN_TOUCH
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .gap(12.px),
            horizontalArrangement = if (breakpoint <= Breakpoint.SM)
                Arrangement.Center else Arrangement.Start
        ) {
            SocialIcon.entries.filter {
                !it.name.contains("Light")
            }.forEach {
                iconButton(
                    modifier = SocialIconStyle.toModifier(),
                    colorMode = colorMode,
                    icon = it.icon,
                    link = it.link
                )
            }
        }
    }
}