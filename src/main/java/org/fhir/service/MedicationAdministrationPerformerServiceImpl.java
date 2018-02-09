/*
 * #%L
 * FHIR Implementation
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
 
/**
 * This code is 100% AUTO generated. Please do not modify it DIRECTLY
 * If you need new features or function or changes please update the templates
 * then submit the template through our web interface.  
 */

package org.fhir.service;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.util.Objects.requireNonNull;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import org.fhir.dao.*;
import org.fhir.entity.*;
import org.fhir.pojo.MedicationAdministrationPerformer;
/**
* auto generated from SQL files
*/
public class MedicationAdministrationPerformerServiceImpl implements MedicationAdministrationPerformerService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MedicationAdministrationPerformerDao dao;

  @Inject
  public MedicationAdministrationPerformerServiceImpl(final MedicationAdministrationPerformerDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public MedicationAdministrationPerformer find(String id) {
    final MedicationAdministrationPerformer result = dao.find(id);
    logger.info("find(MedicationAdministrationPerformer) - exited - return value={} result ");
    return result;
  }

  public List<MedicationAdministrationPerformer> select(int maxResult) {
      final List<MedicationAdministrationPerformer> result = dao.select(maxResult);
      logger.info("select(MedicationAdministrationPerformer) - exited - return value={} result ");

      return result;
  }

  public List<MedicationAdministrationPerformer> selectAll() {
      final List<MedicationAdministrationPerformer> results = dao.selectAll();
      logger.info("selectAll(MedicationAdministrationPerformer) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public MedicationAdministrationPerformer create(MedicationAdministrationPerformer bean) {
  	requireNonNull(bean);
    logger.info("create(MedicationAdministrationPerformer={}) - entered bean ");

    final MedicationAdministrationPerformer result = dao.create(bean);

    logger.info("create(MedicationAdministrationPerformer) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public MedicationAdministrationPerformer update(MedicationAdministrationPerformer bean) {
  	requireNonNull(bean);
    logger.info("update(MedicationAdministrationPerformer={}) - entered bean ");

    final MedicationAdministrationPerformer result = dao.update(bean);

    logger.info("update(MedicationAdministrationPerformer) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(MedicationAdministrationPerformer bean) {
  	requireNonNull(bean);
    logger.info("delete(MedicationAdministrationPerformer={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(MedicationAdministrationPerformer) - exited - return value={} result ");
  }
}