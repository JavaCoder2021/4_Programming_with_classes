/*
 * 6.  
 * Составьте  описание  класса  для  представления  времени.  
 * Предусмотрите  возможности установки  времени и изменения его отдельных полей (час, минута, секунда) 
 * с проверкой допустимости вводимых значений. 
 * В случае недопустимых  значений полей  поле  устанавливается  в  значение  0.  
 * Создать  методы  изменения  времени на заданное количество часов, минут и секунд.
 */
package by.epam.classes.the_simplest_classes_and_objects.task6;

public class Time {

	private int sec, min, hours;
	
	public Time() {
		super();
	}

	public Time(int hours_, int min_, int sec_) {
		super();
		setTime(hours_, min_, sec_);
	}

	public void setTime(int hours_, int min_, int sec_) {
		sec = (sec_ >= 0 && sec_ < 60) ? sec_ : 0;
		min = (min_ >= 0 && min_ < 60) ? min_ : 0;
		hours = (hours_ >= 0 && hours_ < 24) ? hours_ : 0;
	}

	public void setSec(int sec_) {
		sec = (sec_ >= 0 && sec_ < 60) ? sec_ : 0;
	}

	public void setMin(int min_) {
		min = (min_ >= 0 && min_ < 60) ? min_ : 0;
	}

	public void setHours(int hours_) {
		hours = (hours_ >= 0 && hours_ < 24) ? hours_ : 0;
	}

	public void addSeconds(int sec_) {
		if (sec_ < 0) sec_ = 0;
		sec += sec_;

		min += sec / 60;
		sec = sec % 60;

		hours += min / 60;
		min = min % 60;

		hours = hours % 24;
	}

	public void addMinutes(int min_) {
		addSeconds(min_ * 60);
	}

	public void addHours(int hours_) {
		addSeconds(hours_ * 60 * 60);
	}

	public void addTime(int hours_, int min_, int sec_) {
		addSeconds(hours_ * 60 * 60 + min_ * 60 + sec_);
	}

	@Override
	public String toString() {
		return hours + " ч " + min + " мин " + sec + " сек";
	}

}
