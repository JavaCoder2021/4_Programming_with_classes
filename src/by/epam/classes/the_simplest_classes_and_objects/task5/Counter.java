/*
 * 5. 
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение 
 * на  единицу  в  заданном  диапазоне.  Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и 
 * произвольными  значениями. Счетчик  имеет  методы  увеличения  и  уменьшения  состояния,  и  метод 
 * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса. 
 */
package by.epam.classes.the_simplest_classes_and_objects.task5;

public class Counter {

	private int min, max, current;

	public Counter(int min_, int max_, int current_) {
		min = min_;
		max = max_;
		current = current_;

		if (max < min) {
			int tmp = max;
			max = min;
			min = tmp;
			current = min;
		}

		if (current < min)
			current = min;

		if (current > max)
			current = max;
	}

	public Counter(int min_, int max_) {
		this(min_, max_, min_);
	}

	public Counter() {
		this(0, 16, 0);
	}

	public void inc() {
		current++;
		if (current > max)
			current = min;
	}

	public void dec() {
		current--;
		if (current < min)
			current = max;
	}

	public int value() {
		return current;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + current;
		result = prime * result + max;
		result = prime * result + min;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (current != other.current)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Counter [min=" + min + ", max=" + max + ", current=" + current + "]";
	}

}
