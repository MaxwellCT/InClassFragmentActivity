    package edu.temple.inclassactivity
    
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
    
            // Fetch images into IntArray called imageArray
            val typedArray = resources.obtainTypedArray(R.array.image_ids)
            val imageArray = IntArray(typedArray.length()) {typedArray.getResourceId(it, 0)}
            typedArray.recycle()
    
            // Attach an instance of ImageDisplayFragment using factory method
    
            val ccf_image = intArrayOf(
                R.drawable.ccf_saltedcaramel,
                R.drawable.ccf_godiva,
                R.drawable.ccf_coconutcreampie,
                R.drawable.ccf_lowlicious
            )

            val fragment = ImageDisplayFragment.newInstance(ccf_image)
    
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, fragment)
                .commit()
    
        }
    }