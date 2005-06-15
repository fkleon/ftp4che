/**
 * Created on 11.06.2005
 * @author kurt
 */
package org.ftp4che.commands;

import java.util.ArrayList;
import java.util.List;

import org.ftp4che.Command;
import org.ftp4che.Result;

public class STRUCommand implements Command {
    Result result[] = null;
    String structureCode;
    
    public STRUCommand( String structureCode ) {
    	setStructureCode( structureCode );
    }
    
	public void setResult(Result[] result) {
		this.result = result;
	}

	public Result[] getResult() {
		return this.result;
	}

	public String getStructureCode() {
		return this.structureCode;
	}

	public void setStructureCode( String structureCode ) {
		this.structureCode = structureCode;
	}
	
	public boolean isError() {
		return false;
	}

	public boolean isFailure() {
		return false;
	}

	public boolean isSuccess() {
		return false;
	}

	public List getTextCommands() {
        List commands = new ArrayList();
        commands.add("STRU " + getStructureCode() + Command.delimiter);
        
        return commands;
	}
}
