<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body>
    <div class="container">
        <form action="controller/ControllerCadastro.php" method="POST">
            <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
                <div class="container-md">
                  <a class="navbar-brand" href="#">SISTEMA WEB</a>
                  <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                  </button>
                  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                    <div class="navbar-nav">
                      <a class="nav-link active" aria-current="page" href="#">Cadastrar</a>
                      <a class="nav-link disabled" aria-disabled="true">Consultar</a>
                    </div>
                  </div>
                </div>
            </nav>

            <div class="mb-3">
            &nbsp;
              <h3>Cadastrar - Agendamento de Potenciais Clientes</h3> 
              <h6>Sistema utilizado para agendamento de serviços</h6>
            &nbsp;
              <label for="txtNome" class="form-label">Nome:</label>
              <input type="text" class="form-control" required name="txtNome" required id="txtNome" aria-describedby="nome">
            </div>
            
            <div class="mb-3">
              <label for="txtTelefone" class="form-label">Telefone:</label>
              <input type="tel" class="form-control" required name="txtTelefone" required id="txtTelefone" placeholder="(xx)xxxxx-xxxx">
            </div>
           
            <div class="mb-3">
                <label for="txtOrigem" class="form-label">Origem:</label>
                <select class="form-select" required name="txtOrigem" required id="txtOrigem">
                    <option selected>Escolher</option>
                    <option value="celular">Celular</option>
                    <option value="fixo">Fixo</option>
                    <option value="whatsapp">WhatsApp</option>
                    <option value="facebook">Facebook</option>
                    <option value="instagram">Instagram</option>
                    <option value="google">Google Meu Negócio</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="txtDataContato" class="form-label">Data do Contato:</label>
                <input type="date" class="form-control" required name="txtDataContato" required id="txtDataContato">
            </div>

            <div class="mb-3">
                <label for="txtObservacao">Observação:</label>
                <textarea class="form-control" required name="txtObservacao" required id="txtObservacao" rows="5"></textarea>
              </div>

            <button type="submit" class="btn btn-primary">Cadastrar</button>
          </form>
    </div>
</body>
</html>