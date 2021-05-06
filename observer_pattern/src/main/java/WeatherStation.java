import Observer.Display.CurrentConditionDisplay;
import Observer.Display.MaxValueDisplay;
import Subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args){
        //Subject
        WeatherData weatherData = new WeatherData();

        //Observer 1
        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);

        //Observer 2
        MaxValueDisplay maxValueDisplay = new MaxValueDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 20.4f);
        weatherData.setMeasurements(82, 62, 16.4f);
        weatherData.setMeasurements(32, 54, 25.4f);
    }
}
