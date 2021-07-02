package com.leeeyou.sampleoflifecycle

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.AttributeSet
import android.view.*
import com.orhanobut.logger.Logger

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MyFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MyFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class MyFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null
    private var listener: OnFragmentInteractionListener? = null

    override fun onInflate(context: Context?, attrs: AttributeSet?, savedInstanceState: Bundle?) {
        Logger.e(TAG)
        super.onInflate(context, attrs, savedInstanceState)
    }

    override fun onAttach(context: Context) {
        Logger.e(TAG)
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Logger.e(TAG)
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
        Logger.e(TAG)
        return inflater.inflate(R.layout.fragment_club, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Logger.e(TAG)
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Logger.e(TAG)
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        Logger.e(TAG)
        super.onViewStateRestored(savedInstanceState)
    }

    override fun onStart() {
        Logger.e(TAG)
        super.onStart()
    }

    override fun onResume() {
        Logger.e(TAG)
        super.onResume()
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        Logger.e(TAG)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onPrepareOptionsMenu(menu: Menu?) {
        Logger.e(TAG)
        super.onPrepareOptionsMenu(menu)
    }

    override fun onPause() {
        Logger.e(TAG)
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Logger.e(TAG)
        super.onSaveInstanceState(outState)
    }

    override fun onStop() {
        Logger.e(TAG)
        super.onStop()
    }

    override fun onDestroyView() {
        Logger.e(TAG)
        super.onDestroyView()
    }

    override fun onDestroy() {
        Logger.e(TAG)
        super.onDestroy()
    }

    fun onButtonPressed(uri: Uri) {
        listener?.onFragmentInteraction(uri)
    }


    override fun onDetach() {
        Logger.e(TAG)
        super.onDetach()
        listener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments]
     * (http://developer.android.com/training/basics/fragments/communicating.html)
     * for more information.
     */
    interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onFragmentInteraction(uri: Uri)
    }

    companion object {
        const val TAG: String = "MyFragment"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MyFragment.
         */
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MyFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
