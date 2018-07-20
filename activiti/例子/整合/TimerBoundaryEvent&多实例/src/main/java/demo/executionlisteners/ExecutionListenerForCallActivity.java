package demo.executionlisteners;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

public class ExecutionListenerForCallActivity implements ExecutionListener {

	@Override
	public void notify(DelegateExecution execution) {
		if ( execution.isMultiInstanceRoot() == false ) {
			TimeZone tz = TimeZone.getTimeZone("Asia/Shanghai");
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
			df.setTimeZone(tz);  
			
			Calendar now = Calendar.getInstance(tz);
			now.add(Calendar.SECOND, 15);
			
	        String nowAsISO = df.format(now.getTime());  
			execution.setVariable("timeDate", now.getTime());
			System.out.println("timeDate：" + nowAsISO);
		}
	}

}
