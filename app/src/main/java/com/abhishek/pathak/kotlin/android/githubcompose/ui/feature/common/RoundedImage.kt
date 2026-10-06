package com.abhishek.pathak.kotlin.android.githubcompose.ui.feature.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import coil3.request.ImageRequest
import coil3.request.crossfade
import coil3.request.transformations
import coil3.transform.CircleCropTransformation
import com.abhishek.pathak.kotlin.android.githubcompose.R

@Composable
fun RoundedImage(
    url: String,
    @DrawableRes placeholder: Int,
    modifier: Modifier = Modifier,
    crossfade: Boolean = true,
) {
    AsyncImage(
        model = ImageRequest.Builder(androidx.compose.ui.platform.LocalContext.current)
            .data(url)
            .crossfade(crossfade)
            .transformations(CircleCropTransformation())
            .build(),
        contentDescription = null,
        placeholder = painterResource(placeholder),
        contentScale = ContentScale.Crop,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
fun RoundedImagePreview() {
    RoundedImage(
        url = "",
        placeholder = R.drawable.avatar_placeholder,
        modifier = Modifier.size(dimensionResource(id = R.dimen.avatar_size_medium))
    )
}
