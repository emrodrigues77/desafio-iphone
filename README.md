# Modelagem e Diagramação de um Componente iPhone

Modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Diagrama UML

```mermaid
classDiagram

class iPhone
iPhone --> Browser
iPhone --> Phone
iPhone --> MediaPlayer

class MediaPlayer
<<Interface>> MediaPlayer
MediaPlayer : play()
MediaPlayer : pause()
MediaPlayer : selectSong(String songName)

class Phone
<<Interface>> Phone
Phone : call(String phoneNumber)
Phone : answer()
Phone : startVoiceMail()

class Browser
<<Interface>> Browser
Browser : openPage(String url)
Browser : openNewTab()
Browser : refreshPage()
```
