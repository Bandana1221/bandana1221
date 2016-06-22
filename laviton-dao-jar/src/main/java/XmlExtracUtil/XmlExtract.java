package XmlExtracUtil;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import com.laviton.model.MeterLogs;

public class XmlExtract {

	public String getcorrect(String abc) {
		String correct = "" + abc.charAt(0) + abc.charAt(1);
		return correct;
	}

	public float getenergyConsumed(ArrayList<MeterLogs> met) {
		float tot = 0.0f;
		int l = met.size();
		float maxreading = 0.0f;
		float min=0.0f;
		if(l==0)
		{
			return tot=0.0f;
		}
		else{
			min=met.get(0).getMeter_log_total_positive_energy();
			for(MeterLogs m:met)
			{
				if(min>m.getMeter_log_total_positive_energy())
					min=m.getMeter_log_total_positive_energy();
				if(maxreading<m.getMeter_log_total_positive_energy())
					maxreading=m.getMeter_log_total_positive_energy();
					
			
			}
			tot=maxreading-min;
		}

		
		System.out.println(tot);
		return tot;
	}

	public float getenergyConsumedMaximum(ArrayList<MeterLogs> met) {
		float tot = 0.0f;
		int l = met.size();
		float maxreading = 0.0f;
		// float minreading=met.get(0).getMeter_log_total_positive_energy();
		for (MeterLogs m : met) {
			System.out.println(m.getMeter_log_total_positive_energy());
			if (m.getMeter_log_total_positive_energy() > maxreading) {
				maxreading = m.getMeter_log_total_positive_energy();
			}

		}

		tot = maxreading;

		System.out.println(tot);
		return tot;
	}

	public float getenergyConsumedMinimum(ArrayList<MeterLogs> met) {
		float tot = 0.0f;
		int l = met.size();
		if(l==0)
		{
			return tot=0.0f;
		}
		float minreading = met.get(0).getMeter_log_total_positive_energy();
		for (MeterLogs m : met) {
			System.out.println(m.getMeter_log_total_positive_energy());
			if (m.getMeter_log_total_positive_energy() < minreading) {
				minreading = m.getMeter_log_total_positive_energy();
			}

		}

		tot = minreading;

		System.out.println(tot);
		return tot;
	}

	public ArrayList<String> listOfDates(Date date, int day) {
		ArrayList<String> dates = new ArrayList<String>();
		for (int i = 0; i <= day; i++) {
			DateTimeFormatter format = DateTimeFormatter
					.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDate now = date.toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
			LocalDate then = now.minusDays(i);
			String t = "" + then;
			Date date1 = Date.from(then.atStartOfDay(ZoneId.systemDefault())
					.toInstant());
			dates.add(t);
		}
		return dates;
	}

	public ArrayList<String> Dates(Date date, int day) {
		ArrayList<String> dates = new ArrayList<String>();
		DateTimeFormatter format = DateTimeFormatter
				.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDate now = date.toInstant().atZone(ZoneId.systemDefault())
				.toLocalDate();
		LocalDate then = now.minusDays(day);
		String t = "" + then;
		String n = "" + now;
		Date date1 = Date.from(then.atStartOfDay(ZoneId.systemDefault())
				.toInstant());
		dates.add(n);

		dates.add(t);
		System.out.println(dates.size());

		return dates;
	}

	public ArrayList<String> listOfstartdates(Date date, int day) {
		ArrayList<String> dates = new ArrayList<String>();
		for (int i = 0; i <= day; i++) {
			DateTimeFormatter format = DateTimeFormatter
					.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDate now = date.toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
			LocalDate then = now.plusDays(i);
			String t = "" + then;
			Date date1 = Date.from(then.atStartOfDay(ZoneId.systemDefault())
					.toInstant());
			dates.add(t);
		}
		return dates;
	}

	public ArrayList<String> startdates(Date date, int day) {
		ArrayList<String> dates = new ArrayList<String>();
		String t="";
		String n;
		DateTimeFormatter format1 = DateTimeFormatter
				.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDate now1 = date.toInstant().atZone(ZoneId.systemDefault())
				.toLocalDate();
		n=""+now1;
		for (int i = 0; i <= day; i++) {
			DateTimeFormatter format = DateTimeFormatter
					.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDate now = date.toInstant().atZone(ZoneId.systemDefault())
					.toLocalDate();
			LocalDate then = now.plusDays(i);
			t = "" + then;
			Date date1 = Date.from(then.atStartOfDay(ZoneId.systemDefault())
					.toInstant());
			
		}
		dates.add(n);
		dates.add(t);
System.out.println("in startdate"+dates.size());
		return dates;
	}

}
