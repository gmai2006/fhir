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

package org.fhir.dao;

import static java.util.Objects.requireNonNull;
import java.util.List;
import org.fhir.entity.*;
import javax.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.inject.Provider;

import org.fhir.entity.MedicationDispenseModel;
import org.fhir.pojo.MedicationDispense;
import org.fhir.pojo.MedicationDispenseHelper;
import org.fhir.utils.QueryBuilder;

public class MedicationDispenseDaoImpl implements MedicationDispenseDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationDispenseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationDispense find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationDispenseModel model = em.find(MedicationDispenseModel.class, id);
    if (null == model) return null;
    return new MedicationDispense(model);
  }

  @Override
  public List<MedicationDispense> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationDispenseModel a", MedicationDispenseModel.class).setMaxResults(maxResult);
      List<MedicationDispenseModel> models = query.getResultList();
      return MedicationDispenseHelper.fromArray2Array(models);
  }

  @Override
  public List<MedicationDispense> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationDispenseModel a", MedicationDispenseModel.class);
      List<MedicationDispenseModel> models = query.getResultList();
      return MedicationDispenseHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public MedicationDispense create(MedicationDispense e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationDispenseModel(e));
      return e;
  }

  @Transactional
  public MedicationDispense update(MedicationDispense e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationDispenseModel model = em.merge(new MedicationDispenseModel(e));
      return new MedicationDispense(model);
  }
  @Override
  @Transactional
  public void delete(MedicationDispense e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationDispenseModel removed = em.find(MedicationDispenseModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<MedicationDispense> findByPartOf(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.partOf_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByCategory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, CodeableConcept b where a.category_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByMedicationCodeableConcept(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, CodeableConcept b where a.medicationCodeableConcept_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByMedicationReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.medicationReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findBySupportingInformation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.supportingInformation_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByPerformer(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, MedicationDispensePerformer b where a.performer_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByAuthorizingPrescription(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.authorizingPrescription_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByQuantity(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Quantity b where a.quantity_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByDaysSupply(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Quantity b where a.daysSupply_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByDestination(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.destination_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByReceiver(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.receiver_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByDosageInstruction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Dosage b where a.dosageInstruction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findBySubstitution(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, MedicationDispenseSubstitution b where a.substitution_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByDetectedIssue(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.detectedIssue_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByNotDoneReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, CodeableConcept b where a.notDoneReasonCodeableConcept_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByNotDoneReasonReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.notDoneReasonReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByEventHistory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Reference b where a.eventHistory_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationDispense> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<MedicationDispense> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationDispenseModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<MedicationDispense> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, MedicationDispenseModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<MedicationDispenseModel> models = query.getResultList();
    return MedicationDispenseHelper.fromArray2Array(models);
  }
}