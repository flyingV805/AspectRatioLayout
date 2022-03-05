package kz.flyingv.aspectratiolayout

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

class AspectRatioLayout: FrameLayout{

    private var isVertical = true
    private var widthRatio: Int = 0
    private var heightRatio: Int = 0

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs){
        val a = context.obtainStyledAttributes(attrs, R.styleable.AspectRatioLayout)
        val ratio = a.getString(R.styleable.AspectRatioLayout_ratio)
        val direction = a.getString(R.styleable.AspectRatioLayout_direction)
        initRatio(ratio, direction)
        a.recycle()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr){
        val a = context.obtainStyledAttributes(attrs, R.styleable.AspectRatioLayout)
        val ratio = a.getString(R.styleable.AspectRatioLayout_ratio)
        val direction = a.getString(R.styleable.AspectRatioLayout_direction)
        initRatio(ratio, direction)
        a.recycle()
    }

    private fun initRatio(ratio: String?, direction: String?){
        if (direction == "horizontal"){isVertical = false}
        val split = ratio?.split(":")
        if (split?.size == 2){
            widthRatio = split[0].toIntOrNull() ?: 0
            heightRatio = split[1].toIntOrNull() ?: 0
        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val newWidth: Int
        val newHeight: Int

        if (isVertical){
            newHeight = MeasureSpec.getSize(heightMeasureSpec)
            newWidth = (widthRatio * newHeight)/heightRatio
        }else{
            newWidth = MeasureSpec.getSize(widthMeasureSpec)
            newHeight = (heightRatio * newWidth)/widthRatio
        }

        super.onMeasure(
            MeasureSpec.makeMeasureSpec(newWidth, MeasureSpec.EXACTLY),
            MeasureSpec.makeMeasureSpec(newHeight, MeasureSpec.EXACTLY)
        )
    }


}