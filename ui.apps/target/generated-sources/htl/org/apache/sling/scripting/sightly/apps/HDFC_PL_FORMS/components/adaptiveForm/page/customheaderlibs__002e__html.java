/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.HDFC_PL_FORMS.components.adaptiveForm.page;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class customheaderlibs__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_clientlib = null;
Object _global_formstructparser = null;
Object _global_clientlibref = null;
Object _dynamic_wcmmode = bindings.get("wcmmode");
out.write("\n");
_global_clientlib = renderContext.call("use", "core/wcm/components/commons/v1/templates/clientlib.html", obj());
_global_formstructparser = renderContext.call("use", com.adobe.cq.forms.core.components.models.form.FormStructureParser.class.getName(), obj());
_global_clientlibref = renderContext.getObjectModel().resolveProperty(_global_formstructparser, "clientLibRefFromFormContainer");
if (renderContext.getObjectModel().toBoolean(_global_clientlibref)) {
    out.write("\n    ");
    {
        Object var_testvariable0 = _global_clientlibref;
        if (renderContext.getObjectModel().toBoolean(var_testvariable0)) {
            {
                Object var_templatevar1 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
                {
                    Object var_templateoptions2_field$_categories = _global_clientlibref;
                    {
                        java.util.Map var_templateoptions2 = obj().with("categories", var_templateoptions2_field$_categories);
                        callUnit(out, renderContext, var_templatevar1, var_templateoptions2);
                    }
                }
            }
        }
    }
    out.write("\n");
}
out.write("\n");
_global_clientlib = renderContext.call("use", "core/wcm/components/commons/v1/templates/clientlib.html", obj());
out.write("\n    ");
{
    Object var_templatevar3 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
    {
        String var_templateoptions4_field$_categories = "HDFC_PL_FORMS.base";
        {
            java.util.Map var_templateoptions4 = obj().with("categories", var_templateoptions4_field$_categories);
            callUnit(out, renderContext, var_templatevar3, var_templateoptions4);
        }
    }
}
out.write("\n        ");
{
    boolean var_testvariable5 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_dynamic_wcmmode, "edit")));
    if (var_testvariable5) {
        {
            Object var_templatevar6 = renderContext.getObjectModel().resolveProperty(_global_clientlib, "css");
            {
                String var_templateoptions7_field$_categories = "core.forms.components.runtime.all";
                {
                    java.util.Map var_templateoptions7 = obj().with("categories", var_templateoptions7_field$_categories);
                    callUnit(out, renderContext, var_templatevar6, var_templateoptions7);
                }
            }
        }
    }
}
out.write("\n\n\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

