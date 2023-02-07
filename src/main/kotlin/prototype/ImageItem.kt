package prototype

class ImageItem : ReportItemPrototype {
    var url: String? = null
    var width: Int? = null

    constructor()

    constructor(source: ImageItem) {
        this.url = source.url
        this.width = source.width
    }

    override fun clone(): ImageItem {
        return ImageItem(this)
    }
}