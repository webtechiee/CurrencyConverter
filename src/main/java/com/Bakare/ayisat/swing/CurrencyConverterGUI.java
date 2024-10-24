package com.Bakare.ayisat.swing;

import com.Bakare.ayisat.controllers.ExchangeService;
import com.Bakare.ayisat.models.CurrencyRequest;
import com.Bakare.ayisat.models.CurrencyResponse;
import com.Bakare.ayisat.models.Logger;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class CurrencyConverterGUI {
    private static JFrame frame;
    private static JTextField inputAmount;
    private static JComboBox<String> baseBox;
    private static JComboBox<String> targetBox;
    private static JLabel resultLabel;
    private static JLabel conversionRateLabel;
    private static final String currencies = "AED AFN ALL AMD ANG AOA ARS AUD AWG AZN BAM BBD BDT BGN BHD BIF BMD BND BOB BRL BSD BTN BWP BYN BZD CAD CDF CHF CLP CNY COP CRC CUP CVE CZK DJF DKK DOP DZD EGP ERN ETB EUR FJD FKP FOK GBP GEL GGP GHS GIP GMD GNF GTQ GYD HKD HNL HRK HTG HUF IDR ILS IMP INR IQD IRR ISK JEP JMD JOD JPY KES KGS KHR KID KMF KRW KWD KYD KZT LAK LBP LKR LRD LSL LYD MAD MDL MGA MKD MMK MNT MOP MRU MUR MVR MWK MXN MYR MZN NAD NGN NIO NOK NPR NZD OMR PAB PEN PGK PHP PKR PLN PYG QAR RON RSD RUB RWF SAR SBD SCR SDG SEK SGD SHP SLE SOS SRD SSP STN SYP SZL THB TJS TMT TND TOP TRY TTD TVD TWD TZS UAH UGX USD UYU UZS VES VND VUV WST XAF XCD XDR XOF XPF YER ZAR ZMW ZWL";
    private static final String[] arrayCurrencies = currencies.split(" ");

    public CurrencyConverterGUI() {}

    public void convertTheseCurrencies () {
        frame = new JFrame("Currency Exchange");
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to Currency Converter");
        welcomeLabel.setBounds(100, 10, 500, 30);
        frame.add(welcomeLabel);

        JLabel amountLabel = new JLabel("Amount: ");
        amountLabel.setBounds(50, 50, 100, 30);
        frame.add(amountLabel);

        inputAmount = new JTextField();
        inputAmount.setBounds(150, 50, 150, 30);
        frame.add(inputAmount);

        JLabel fromCurrencyLabel = new JLabel("Base currency: ");
        fromCurrencyLabel.setBounds(50, 100, 100, 30);
        frame.add(fromCurrencyLabel);

        baseBox = new JComboBox<>(arrayCurrencies);
        baseBox.setBounds(150, 100, 150, 30);
        frame.add(baseBox);

        JLabel toCurrencyLabel = new JLabel("Target currency: ");
        toCurrencyLabel.setBounds(50, 150, 100, 30);
        frame.add(toCurrencyLabel);

        targetBox = new JComboBox<>(arrayCurrencies);
        targetBox.setBounds(150, 150, 150, 30);
        frame.add(targetBox);

        JButton convertButton = new JButton("Make exchange");
        convertButton.setBounds(150, 200, 150, 30);
        convertButton.setForeground(Color.white);
        convertButton.setBackground(Color.BLUE);
        frame.add(convertButton);

        resultLabel = new JLabel("Result:");
        resultLabel.setBounds(150, 250, 300, 30);
        frame.add(resultLabel);

        conversionRateLabel = new JLabel("Conversion rate is:");
        conversionRateLabel.setBounds(150, 300, 300, 30);
        frame.add(conversionRateLabel);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(150, 350, 150, 30);
        exitButton.setBackground(Color.RED);
        frame.add(exitButton);

        //      calling the buttons using a lambda expression
        convertButton.addActionListener(button -> {
            try {
                convertCurrency();
                //prompting the user to make another exchange
                convertButton.setText("Another Exchange?");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "try again, there's been an error");

            }
        });


        //        calling the exit button with lambdas expression
        exitButton.addActionListener(button -> {
            try {
                //exit the application
                System.exit(0);
            } catch (Exception ex) {
                //exit the application any ways
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

    private void convertCurrency () throws IOException {
        double amount = Double.parseDouble(inputAmount.getText());
        String fromCurrency = (String) baseBox.getSelectedItem();
        String toCurrency = (String) targetBox.getSelectedItem();
        CurrencyRequest cRequest = new CurrencyRequest(fromCurrency, toCurrency, amount);

        ExchangeService exchangeService = new ExchangeService();
        CurrencyResponse cResponse = exchangeService.exchangeCurrencies(cRequest);
        double result = cResponse.getConversionResult();
        double conversionRate = cResponse.getConversionRate();
        //logs
        String printOut = "user changed " + amount + fromCurrency + " to " + result+toCurrency + " at " + cResponse.getDateTime();



        resultLabel.setText("Result: " + result);
        conversionRateLabel.setText("Conversion rate is :" + conversionRate);
        new Logger(printOut);
        //setting colour text
        if (result < amount)
            resultLabel.setForeground(Color.RED);
        else
            resultLabel.setForeground(Color.BLUE);

    }
}