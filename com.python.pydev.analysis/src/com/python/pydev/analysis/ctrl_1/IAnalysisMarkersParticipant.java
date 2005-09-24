/*
 * Created on 24/09/2005
 */
package com.python.pydev.analysis.ctrl_1;

import java.util.List;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.python.pydev.editor.PyEdit;
import org.python.pydev.editor.actions.PySelection;
import org.python.pydev.plugin.nature.PythonNature;

import com.python.pydev.analysis.IAnalysisPreferences;

public interface IAnalysisMarkersParticipant {

    /**
     * This method must be overriden for any participant that returns suggestions when a ctrl 1 is executed
     * and there are analysis markers present at the line
     * 
     * @param marker the marker that should be analyzed for completions
     * @param analysisPreferences the analysis preferences that should be used
     * @param line the line where the analysis is happening
     * @param ps the selection
     * @param offset the offset where it is happening
     * @param nature this is the nature from the project that is being used
     * @param edit the edit where the completions where required
     * @param props OUT: the completions should be added to this list
     * 
     * @throws BadLocationException
     * @throws CoreException 
     */
    public abstract void addProps(IMarker marker, IAnalysisPreferences analysisPreferences, 
            String line, PySelection ps, int offset, PythonNature nature,
            PyEdit edit, List<ICompletionProposal> props) throws BadLocationException, CoreException;

}