package com.example.twosidednavbar


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 */
class SampleFragment : Fragment() {

    companion object {
        fun create(img: Int): SampleFragment {

            val bndl = Bundle()
            bndl.putInt("keyImg", img)

            val frag = SampleFragment()
            frag.arguments = bndl

            return frag
        }
    }
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val vw= inflater?.inflate(R.layout.fragment_sample, container, false)
        vw?.setBackgroundResource(arguments.getInt("keyImg"))
        return vw
    }

}// Required empty public constructor
