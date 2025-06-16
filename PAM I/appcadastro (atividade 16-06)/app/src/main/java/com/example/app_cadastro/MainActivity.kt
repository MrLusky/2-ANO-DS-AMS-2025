package com.example.app_cadastro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app_cadastro.ui.theme.AppcadastroTheme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app_cadastro.ui.theme.Darkblue
import com.example.app_cadastro.ui.theme.Lightblue
import com.example.app_cadastro.ui.theme.Pink40
import com.example.app_cadastro.ui.theme.white


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppcadastroTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProdutoItem(modifier = Modifier.padding(innerPadding))
                }

            }
        }
    }
}

@Composable
fun ProdutoItem(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    var nome by remember { mutableStateOf("")}
    var telefone by remember { mutableStateOf("")}
    var curso by remember { mutableStateOf("")}
    var serie by remember { mutableStateOf("")}
    var observacoes by remember { mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .height(180.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(Darkblue, Lightblue)
                    )
                )
                .fillMaxWidth()
        ) {
            Row(modifier = Modifier
                .padding(16.dp)
                .align(Alignment.Center)) {
                Image(
                    painter = painterResource(id = R.drawable.avatr_woman),
                    contentDescription = "Foto do Contato",
                    modifier = Modifier.size(60.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Column {
                    Text(text = "Registre-se", color = white)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = "Teste de Card", color = white)
                }
            }
        }


        Spacer(Modifier.height(55.dp))
        Column(
            Modifier.padding(16.dp)
        ) {
            Text(
                text = "Cadastre-se",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 35.sp,
            )
            Spacer(Modifier.height(25.dp))
            Text(
                text = "Nome: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text("Digite o seu nome completo") },
                maxLines = 2
            )
            Spacer(Modifier.height(25.dp))
            Text(
                text = "Telefone: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = telefone,
                onValueChange = { telefone = it },
                label = { Text("Digite o número de telefone") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            )
            Spacer(Modifier.height(25.dp))
            Text(
                text = "Curso: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = curso,
                onValueChange = { curso = it },
                label = { Text("Digite o nome do curso") },
                maxLines = 2
            )
            Spacer(Modifier.height(25.dp))
            Text(
                text = "Série: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = serie,
                onValueChange = { serie = it },
                label = { Text("Digite o número da sua série") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                maxLines = 2
            )
            Spacer(Modifier.height(25.dp))
            Text(
                text = "Observações: ",
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(250),
                fontSize = 25.sp,
            )
            Spacer(Modifier.height(15.dp))
            TextField(
                value = observacoes,
                onValueChange = { observacoes = it },
                label = { Text("Digite quaisquer observações") },
                maxLines = 2
            )
        }
        Column(
            Modifier.padding(1.dp)
        ) {
            Button(
                onClick = {/* TODO */ }
            ) {
                Text(text = "Cadastrar")
            }
        }
    }
}

@Preview
@Composable
fun appPreview() {
    AppcadastroTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            ProdutoItem()
        }
    }
}