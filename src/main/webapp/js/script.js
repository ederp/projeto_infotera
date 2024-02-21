function adicionarNovoDocumento() {
    // Container onde os novos campos serão adicionados
    var container = $('.novoDocumento');
    
    const novosInputs = `
        <div class="campo">
            <label for="numeroDocumento">Número do Documento </label>
            <input type="text" id="numeroDocumento" name="cadastroBean.novaPessoa.documentos[novoDocumento].numero"/>
        </div>
        <div class="campo">
            <label for="tipoDocumento">Tipo do Documento </label>
            <input type="text" id="tipoDocumento" name="cadastroBean.novaPessoa.documentos[novoDocumento].tipoDocumento"/>
        </div>
    `;

    container.append(novosInputs);
}

function adicionarNovoContato() {
    // Container onde os novos campos serão adicionados
    var container = $('.novoContato');
    
    const novosInputs = `
        <div class="campo">
            <label for="tipoContato">Tipo do Contato </label>
            <input type="text" id="tipoContato" name="cadastroBean.novaPessoa.contatos[novoContato].tipoContato"/>
        </div>
        <div class="campo">
            <label for="numeroTelefone">Telefone </label>
            <input type="text" id="numeroTelefone" name="cadastroBean.novaPessoa.contatos[novoContato].telefone"/>
        </div>
        <div class="campo">
            <label for="enderecoEmail">E-mail </label>
            <input type="text" id="enderecoEmail" name="cadastroBean.novaPessoa.contatos[novoContato].email"/>
        </div>
    `;

    container.append(novosInputs);
}

function adicionarNovoEndereco() {
    // Container onde os novos campos serão adicionados
    var container = $('.novoEndereco');

    const novosInputs = `
        <div class="campo">
            <label for="rua">Rua </label>
            <input type="text" id="rua" name="cadastroBean.novaPessoa.enderecos[novoEndereco].rua"/>
        </div>
        <div class="campo">
            <label for="numero">Número </label>
            <input type="text" id="numero" name="cadastroBean.novaPessoa.enderecos[novoEndereco].numero"/>
        </div>
        <div class="campo">
            <label for="cidade">Cidade </label>
            <input type="text" id="cidade" name="cadastroBean.novaPessoa.enderecos[novoEndereco].cidade"/>
        </div>
        <div class="campo">
            <label for="estado">Estado </label>
            <input type="text" id="estado" name="cadastroBean.novaPessoa.enderecos[novoEndereco].estado"/>
        </div>
        <div class="campo">
            <label for="pais">País </label>
            <input type="text" id="pais" name="cadastroBean.novaPessoa.enderecos[novoEndereco].pais"/>
        </div>
    `;

    container.append(novosInputs);
}
