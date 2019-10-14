package by.epam.java.kazlova.task2;

//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

public class Text {
    private Word name;
    private Sentence[] text;

    public Text(Word name, Sentence[] text) {
        this.name = name;
        this.text = text;
    }

    public Word getName() {
        return name;
    }

    public void setName(Word name) {
        this.name = name;
    }

    public Sentence[] getText() {
        return text;
    }

    public void setText(Sentence[] text) {
        this.text = text;
    }

    public void add(Sentence[] sentences){
        Sentence[] newText= new Sentence[this.text.length+sentences.length];
        for(int i=0; i<this.text.length; i++){
            newText[i]=text[i];
        }
        for(int i=text.length; i<newText.length; i++){
            newText[i]=sentences[i];
        }
        text=newText;
    }

    public void add(String[] sentences){
        Sentence[] newText= new Sentence[this.text.length+sentences.length];
        for(int i=0; i<this.text.length; i++){
            newText[i]=text[i];
        }
        for(int i=text.length; i<newText.length; i++){
            newText[i]=new Sentence(sentences[i]);
        }
        text=newText;
    }

    public String textToString(){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<text.length; i++){
            sb.append(text[i].getClause()).append(" ");
        }
        return sb.toString();
    }
}
