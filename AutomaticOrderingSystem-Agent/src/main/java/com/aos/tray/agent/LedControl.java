 package com.aos.tray.agent;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class LedControl {
	private GpioController gpio;
	private GpioPinDigitalOutput pin;
	
	public LedControl() {
		this.gpio = GpioFactory.getInstance();
		this.pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_18);
	}
	
	public void ledOn() {
		pin.high();
		
		gpio.unprovisionPin(pin);
	}
	
	public void ledOff() {
		pin.low();
		
		gpio.unprovisionPin(pin);
	}
}
