import android.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class MedicalFragment extends Fragment {
	private Medical mMedical;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		mMedical = new Medical();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_medical, parent, false);
		
		mTitleField = (EditText)v.findViewById(R.id.medical_title);
		mTitleField.addTextChangedListener(new TextWatcher() {
			CharSequence c, int start, int before, int count){
			mMedical.setTitle(c.toString());
		}
		
		public void beforeTextChanged(
				CharSequence c, int start, int count, int after){
			
		}
		public void afterTextChanged(Editable c){
			
		}
	});
		
		return v;
	}
}
