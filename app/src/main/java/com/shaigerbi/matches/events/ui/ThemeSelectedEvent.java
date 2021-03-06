package com.shaigerbi.matches.events.ui;

import com.shaigerbi.matches.events.AbstractEvent;
import com.shaigerbi.matches.events.EventObserver;
import com.shaigerbi.matches.themes.Theme;

public class ThemeSelectedEvent extends AbstractEvent {

	public static final String TYPE = ThemeSelectedEvent.class.getName();
	public final Theme theme;

	public ThemeSelectedEvent(Theme theme) {
		this.theme = theme;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
