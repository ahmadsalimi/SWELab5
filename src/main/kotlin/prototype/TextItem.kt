package prototype

class TextItem : ReportItemPrototype {
    var text: String? = null
    var color: String? = null

    constructor()

    constructor(source: TextItem) {
        this.text = source.text
        this.color = source.color
    }

    fun initializeText(newText: String, newColor: String) {
        this.text = newText
        this.color = newColor
    }

    override fun clone(): TextItem {
        return TextItem(this)
    }
}