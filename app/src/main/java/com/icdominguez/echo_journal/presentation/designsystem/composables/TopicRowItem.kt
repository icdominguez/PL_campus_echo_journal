package com.icdominguez.echo_journal.presentation.designsystem.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.icdominguez.echo_journal.presentation.designsystem.theme.LocalEchoJournalTypography
import com.icdominguez.echo_journal.presentation.designsystem.theme.Primary30

@Composable
fun TopicRowItem(
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {},
    topic: String = "",
    isSelected: Boolean = false,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                onClick()
            },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    bottom = 10.dp,
                    start = 12.dp,
                    end = 8.dp,
                ),
            text = "#",
            style = LocalEchoJournalTypography.current.button.copy(color = MaterialTheme.colorScheme.primary),
        )
        Text(
            modifier = Modifier.padding(start = 4.dp),
            text = topic,
            style = LocalEchoJournalTypography.current.button
                .copy(color = Color(0xFF3B4663))
        )

        Spacer(modifier = Modifier.weight(1f))

        if(isSelected) {
            Image(
                modifier = Modifier
                    .padding(end = 8.dp),
                imageVector = Icons.Default.Check,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Primary30)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TopicRowItemPreview() {
    TopicRowItem(
        topic = "Topic",
        isSelected = true
    )
}