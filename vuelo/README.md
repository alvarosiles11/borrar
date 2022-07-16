### 🔗 **Linter**

---

---

######

señala reglas o mejoras de tu codigo
linter .editorconfig helps developers define and maintain
consistent coding styles between different editors and IDEs

1. 📥 install [editorconfig](https://marketplace.visualstudio.com/items?itemName=EditorConfig.EditorConfig) extension in visual code
2. 📂 Crear archivo **.editorconfig**
3. 📝 Agregar las reglas de linter

#### 📌 Regla en General

```
root = true

[   *   ]
trim_trailing_whitespace = true (regla no espacios)
indent_style             = space (regla tabs)
charset                  = utf-8 (ASCII de 8 bits)
end_of_line              = lf (LF caracteres de control ASCII y Unicode)
indent_size              = 2 (salto de linea)
insert_final_newline     = true (agrega una linea al final)
```

#### 📌 Regla para C# y Visual Basic

```
root = true
[*.{cs,vb}]
dotnet_diagnostic.IDE0005.severity = error
dotnet_diagnostic.CA1822.severity = error
```

#### 📌 Regla para Java

```
root = true
[*.java]
indent_style			 = space
indent_size 			 = 10
trim_trailing_whitespace = true
indent_style             = space # regla tabs
```

| JavaScript                                                                                                                                                                                                                                        |                                                       Django/Python                                                       |                                                                                                                                                                                                                                                       En general |
| :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | :-----------------------------------------------------------------------------------------------------------------------: | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------: |
| [<img src="https://dbaeumer.gallerycdn.vsassets.io/extensions/dbaeumer/vscode-eslint/2.2.6/1657015175302/Microsoft.VisualStudio.Services.Icons.Default" width="50"/>](https://marketplace.visualstudio.com/items?itemName=dbaeumer.vscode-eslint) | [<img src="https://pypi.org/static/images/logo-small.95de8436.svg" width="50"/>](https://pypi.org/project/flake8-django/) | [<img src="https://sonarsource.gallerycdn.vsassets.io/extensions/sonarsource/sonarlint-vscode/3.7.0/1657612508605/Microsoft.VisualStudio.Services.Icons.Default" width="50"/>](https://marketplace.visualstudio.com/items?itemName=SonarSource.sonarlint-vscode) |
| ESlint                                                                                                                                                                                                                                            |                                                          Flake8                                                           |                                                                                                                                                                                                                                                        SonarLint |
