import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WeatherAppGUI extends JFrame {
    public WeatherAppGUI() {
        super("Weather App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 650);
        setVisible(true);

        setLocationRelativeTo(null);

        setLayout(null);

        setResizable(false);

        addGuiComponents();
    }

    private void addGuiComponents() {

        //Search text field for city
        JTextField searchTextField = new JTextField();

        searchTextField.setBounds(90, 25, 350, 45);
        searchTextField.setFont(new Font("Arial", Font.PLAIN, 20));
        add(searchTextField);

        //Search button for looking up city
        JButton searchButton = new JButton(loadImage("src/assets/search.png"));

        searchButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(440, 25, 45, 43);
        add(searchButton);

        //Weather icon dependent on the weather
        JLabel weatherIcon = new JLabel(loadImage("src/assets/rain.png"));

        weatherIcon.setBounds(45, 125, 450, 220);
        weatherIcon.setHorizontalAlignment(SwingConstants.CENTER);
        add(weatherIcon);


        //Temperature label
        JLabel temperatureLabel = new JLabel("25°C", SwingConstants.CENTER);

        temperatureLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        temperatureLabel.setBounds(0, 350, 550, 50);
        add(temperatureLabel);

        //Weather description label
        JLabel weatherDescriptionLabel = new JLabel("Rainy", SwingConstants.CENTER);

        weatherDescriptionLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        weatherDescriptionLabel.setBounds(0, 400, 550, 50);
        add(weatherDescriptionLabel);


        //Humidity label
        JLabel humidityLabel = new JLabel(loadImage("src/assets/humidity.png"));

        humidityLabel.setBounds(0, 450, 150, 150);
        add(humidityLabel);


        //Humidity text
        JLabel humidityText = new JLabel("<html><b>Humidity</b> 100%</html>");

        humidityText.setBounds(120, 450, 200, 150);
        humidityText.setFont(new Font("Arial", Font.PLAIN, 20));
        add(humidityText);


        //Wind label
        JLabel windLabel = new JLabel(loadImage("src/assets/windspeed.png"));

        windLabel.setBounds(270, 450, 150, 150);
        add(windLabel);


        //Wind text
        JLabel windText = new JLabel("<html><b>Wind</b> 10km/h</html>");
        windText.setBounds(400, 450, 200, 150);
        windText.setFont(new Font("Arial", Font.PLAIN, 20));
        add(windText);

    }

    //Method to load images
    private ImageIcon  loadImage(String path) {
       try {

           BufferedImage image = ImageIO.read(new File(path));

              return new ImageIcon(image);
       }catch (IOException e) {
           e.printStackTrace();
       }

       System.out.println("Error loading image");
         return null;
    }
}
