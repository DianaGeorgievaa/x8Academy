package students;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Comparator;

public class Students {

	private List<Student> students;

	public Students() {
		students = new ArrayList<>();
	}

	public List<Student> getStudents() {
		return students;
	}

	public OptionalDouble getAverageGrade() {
		return students.stream().mapToInt(Student::getGrade).average();
	}

	public List<Student> getPassingStudents() {
		List<Student> passingStudents = students.stream().filter(s -> s.getGrade() >= 3).collect(Collectors.toList());
		return passingStudents;
	}

	public List<Student> getFailingStudets() {
		List<Student> passingStudents = students.stream().filter(s -> s.getGrade() == 2).collect(Collectors.toList());
		return passingStudents;
	}

	public List<Student> getStudentsWithHigherGrade(int grade) {
		List<Student> byGrade = students.stream().filter(s -> s.getGrade() > grade).collect(Collectors.toList());
		return byGrade;
	}

	public List<Student> getStudentsWithSpecificGrade(int grade) {
		List<Student> byGrade = students.stream().filter(s -> s.getGrade() == grade).collect(Collectors.toList());
		return byGrade;
	}

	public void sortStudents() {
		Collections.sort(students, (s1, s2) -> s1.getGrade() - s2.getGrade());
	}

	public Optional<Student> getStudentWithHeighestGrade() {
		Optional<Student> studentWithMaxGrade = students.stream().min(Comparator.comparing(Student::getGrade));
		return studentWithMaxGrade;
	}

	public Map<Gender, List<Student>> getByCriteria() {
		Map<Gender, List<Student>> byGender = students.stream().collect(Collectors.groupingBy(Student::getGender));
		((Collection<Student>) byGender).stream().collect(Collectors.groupingBy(Student::getAge));
		return byGender;
	}

	public Optional<Student> getStudentWithSmallestGrade() {
		Optional<Student> studentWithMinGrade = students.stream().min(Comparator.comparing(Student::getGrade));
		return studentWithMinGrade;
	}

	public OptionalDouble getAverageGradeByGender(Gender gender) {
		Map<Gender, List<Student>> byGender = students.stream().collect(Collectors.groupingBy(Student::getGender));
		for (Map.Entry<Gender, List<Student>> entry : byGender.entrySet()) {
			if (entry.getKey() == gender) {
				OptionalDouble grade = entry.getValue().stream().mapToInt(Student::getGrade).average();
				return grade;
			}
		}
		return null;
	}

	public List<String> getEmailHeaders() {
		List<String> emails = students.stream().map(Student::getEmail).collect(Collectors.toList());
		return emails;
	}

	public Map<Integer, Long> getMarksByDistribution() {
		Map<Integer, Long> s = students.stream().map(s1 -> s1.getGrade())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		return s;
	}

}
