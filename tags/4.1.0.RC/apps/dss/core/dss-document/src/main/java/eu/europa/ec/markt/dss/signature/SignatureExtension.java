/*
 * DSS - Digital Signature Services
 *
 * Copyright (C) 2013 European Commission, Directorate-General Internal Market and Services (DG MARKT), B-1049 Bruxelles/Brussel
 *
 * Developed by: 2013 ARHS Developments S.A. (rue Nicolas Bové 2B, L-1253 Luxembourg) http://www.arhs-developments.com
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * "DSS - Digital Signature Services" is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * DSS is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * "DSS - Digital Signature Services".  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.europa.ec.markt.dss.signature;

import java.io.IOException;

import javax.xml.bind.JAXBException;

import eu.europa.ec.markt.dss.exception.DSSException;
import eu.europa.ec.markt.dss.parameter.SignatureParameters;

/**
 * Extends the level of AdES signature of a document. After level -B, going upper in the signature format level
 * consists of adding unsigned properties to the signature. It can be done without breaking the signature.
 *
 * @version $Revision: 2815 $ - $Date: 2013-10-28 15:38:50 +0100 (Mon, 28 Oct 2013) $
 */

public interface SignatureExtension {

    /**
     * Extends the level of the signatures contained in a document.
     *
     * @param document The signed document to be signed
     * @param params
     * @return
     * @throws IOException
     * @throws JAXBException
     */
    DSSDocument extendSignatures(DSSDocument document, SignatureParameters params) throws DSSException;

}
