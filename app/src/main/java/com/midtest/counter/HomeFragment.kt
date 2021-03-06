package com.midtest.counter

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@Suppress("UNREACHABLE_CODE")
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonPlus: Button = view.findViewById(R.id.button_plus)
        val buttonMinus: Button = view.findViewById(R.id.button_minus)
        val countView: TextView = view.findViewById(R.id.count_view)
        val buttonReset: ImageButton = view.findViewById(R.id.btn_reset)
        val buttonEdit: ImageButton = view.findViewById(R.id.btn_edit)


        var numstart = 0
        countView.setText("" + numstart)
        // code resource: https://ssaurel.medium.com/create-your-first-android-app-with-kotlin-64eb33854ce0


        //button plus
        buttonPlus.setOnClickListener{
//            val countView: TextView = view.findViewById(R.id.count_view)
//            countView.text = "2" //default text when onCreate is 2

            countView.setText(""+ ++numstart)


        }

        // button minus
        buttonMinus.setOnClickListener{

            countView.setText(""+ --numstart)
        }


        buttonReset.setOnClickListener{
            Toast.makeText(
                activity,
                "RESET",
                Toast.LENGTH_SHORT  ).show()

            countView.setText("0")
        }


        buttonEdit.setOnClickListener{
            Toast.makeText(
                activity,
                "button edit clicked",
                Toast.LENGTH_SHORT  ).show()
        }


        }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}

