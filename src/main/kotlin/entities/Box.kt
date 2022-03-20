package entities

//secondary constructors
class Box {
    //jesli nie podam jawnie modyfikatora to ten modyfikator jest domyslnie public
    var stringData: String = ""
    var intData = 0

    constructor(stringData: String){
        this.stringData = stringData
    }

    constructor(stringData: String, intData: Int) {
        this.stringData = stringData
        this.intData = intData
    }

}