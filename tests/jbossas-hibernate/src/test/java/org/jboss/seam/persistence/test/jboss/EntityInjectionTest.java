/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.seam.persistence.test.jboss;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.seam.persistence.test.EntityInjectionTestBase;
import org.jboss.seam.persistence.transaction.test.util.JbossasTestUtils;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;

/**
 * Tests that injection is working for JPA entities
 * 
 * @author Stuart Douglas
 * 
 */
@RunWith(Arquillian.class)
public class EntityInjectionTest extends EntityInjectionTestBase
{
   @Deployment
   public static Archive<?> createTestArchive()
   {
      WebArchive war = JbossasTestUtils.createTestArchive();

      war.addClasses(getTestClasses());
      war.addWebResource("META-INF/persistence-orm.xml", "classes/META-INF/persistence.xml");
      war.addWebResource("META-INF/orm.xml", "classes/META-INF/orm.xml");
      return war;
   }

}
