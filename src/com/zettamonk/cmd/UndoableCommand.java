package com.zettamonk.cmd;

public interface UndoableCommand extends Command {
	public void undo();
}
